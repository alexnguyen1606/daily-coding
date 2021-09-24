package com.brownbox_online.list;

import java.util.*;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:34 PM ,September 15,2021
 */
// Design Twitter 255
public class Twitter {

  public Twitter() {}

  private static final Integer DEFAULT_NEWS_FEED = 10;

  private Map<Integer, User> userMap = new HashMap<>();

  /** Compose a new tweet. */
  public void postTweet(int userId, int tweetId) {
    NewsFeed newsFeed = new NewsFeed(tweetId);
    if (userMap.containsKey(userId)) {
      userMap.get(userId).addNewFeed(newsFeed);
    } else {
      User user = new User(userId);
      user.addNewFeed(newsFeed);
      userMap.put(userId, user);
    }
  }

  /**
   * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must
   * be posted by users who the user followed or by the user herself. Tweets must be ordered from
   * most recent to least recent.
   */
  public List<Integer> getNewsFeed(int userId) {
    if (!userMap.containsKey(userId)) {
      return Collections.emptyList();
    }
    User user = userMap.get(userId);
    Set<NewsFeed> newFeeds = new TreeSet<>(user.newsFeeds);
    for (Integer id : user.followed) {
      newFeeds.addAll(userMap.get(id).newsFeeds);
    }
    List<Integer> result = new ArrayList<>(DEFAULT_NEWS_FEED);
    Iterator<NewsFeed> iterator = newFeeds.iterator();
    while (iterator.hasNext() && result.size() < DEFAULT_NEWS_FEED) {
      result.add(iterator.next().id);
    }
    return result;
  }

  /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
  public void follow(int followerId, int followeeId) {
    followValidatedAndCreate(followerId);
    followValidatedAndCreate(followeeId);
    userMap.get(followerId).follow(followeeId);
  }

  private void followValidatedAndCreate(Integer id) {
    if (!userMap.containsKey(id)) {
      userMap.put(id, new User(id));
    }
  }

  /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
  public void unfollow(int followerId, int followeeId) {
    if (userMap.containsKey(followeeId) && userMap.containsKey(followerId)) {
      userMap.get(followerId).unFollow(followeeId);
    }
  }

  private static class User {
    public User(Integer id) {
      this.id = id;
    }

    Integer id;
    List<NewsFeed> newsFeeds = new ArrayList<>();
    Set<Integer> followed = new HashSet<>();

    private void follow(Integer userId) {
      if (followed == null) {
        followed = new HashSet<>();
      }
      followed.add(userId);
    }

    private void unFollow(Integer userId) {
      if (followed != null) {
        followed.remove(userId);
      }
    }

    private void addNewFeed(NewsFeed newsFeed) {
      if (newsFeeds == null) {
        newsFeeds = new ArrayList<>();
      }
      newsFeeds.add(newsFeed);
    }
  }

  private static class NewsFeed implements Comparable<NewsFeed> {
    private static Integer count = 0;

    public NewsFeed(Integer id) {
      this.id = id;
      count++;
      createdOn = count;
    }

    private Integer id;
    private final Integer createdOn;

    @Override
    public boolean equals(Object obj) {
      if (obj instanceof NewsFeed) {
        NewsFeed other = (NewsFeed) obj;
        return this.id.equals(other.id);
      }
      return false;
    }

    @Override
    public int compareTo(NewsFeed o) {
      return -this.createdOn.compareTo(o.createdOn);
    }
  }
}
