package com.leetcode.arrays;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AsteroidCollision_735 {

    public int[] asteroidCollision(int[] asteroids) {
        Asteroid[] weights = new Asteroid[asteroids.length];
        for (int i = 0; i < asteroids.length; i++) {
            weights[i] = new Asteroid(asteroids.length, i, asteroids[i]);
        }

        int remain = weights.length;
        while (remain > 0) {
            for (int i = 0; i < asteroids.length; i++) {
                Asteroid asteroid = weights[i];
                if (asteroid == null || asteroid.outRange()) {
                    continue;
                }
                if (asteroid.explode()) {
                    continue;
                }
                asteroid.nextPosition();
                if (asteroid.outRange()) {
                    remain--;
                    continue;
                }
                Asteroid nextAsteroid = weights[asteroid.index];
                if (nextAsteroid.explode()) {
                    continue;
                }
                if (!asteroid.isCollisionWith(nextAsteroid)) {
                    continue;
                }

                asteroid.calculateRemain(nextAsteroid.weight());
                nextAsteroid.calculateRemain(asteroid.weight());
                if (asteroid.explode()) {
                    remain--;
                }
                if (nextAsteroid.explode()) {
                    remain--;
                }
            }
        }
        List<Asteroid> bucket = Stream.of(weights)
                .filter(Asteroid::survive)
                .sorted(Comparator.comparingInt(o -> o.rootIndex))
                .collect(Collectors.toList());
        int[] result = new int[bucket.size()];
        for (int i = 0; i < bucket.size(); i++) {
            result[i] = bucket.get(i).rawWeight;
        }
        return result;
    }

    static class Asteroid {
        int maxIndex;
        int index;
        int rawWeight;
        int rootIndex;
        boolean explode;

        public Asteroid(int maxIndex, int index, int weight) {
            this.maxIndex = maxIndex;
            this.index = index;
            this.rawWeight = weight;
            this.rootIndex = index;
        }

        public boolean outRange() {
            return index < 0 || index >= maxIndex;
        }

        public boolean isGoLeft() {
            return rawWeight < 0;
        }

        public boolean isGoRight() {
            return !isGoLeft();
        }

        public int predictNextPosition() {
            if (isGoRight()) {
                return index + 1;
            }
            return index - 1;
        }

        public void nextPosition() {
            index = predictNextPosition();
        }

        public boolean isCollisionWith(Asteroid asteroid) {
            return (asteroid.isGoRight() && this.isGoLeft()) || (asteroid.isGoLeft() && this.isGoRight());
        }

        public boolean survive() {
            return !explode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Asteroid asteroid = (Asteroid) o;
            return index == asteroid.index;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index);
        }

        public void calculateRemain(int targetWeight) {
            if (this.weight() - targetWeight <= 0) {
                explode = true;
            }
        }

        public int weight() {
            return isGoLeft() ? rawWeight * -1 : rawWeight;
        }

        public boolean explode() {
            return explode;
        }
    }

    public static void main(String[] args) {
        int[] astroids = new int[]{7, -1, 2, -3, -6, -6, -6, 4, 10, 2};
        AsteroidCollision_735 checker = new AsteroidCollision_735();
        int[] result = checker.asteroidCollision(astroids);
        for (int i : result) {
            System.out.println(i);
        }
    }

}
