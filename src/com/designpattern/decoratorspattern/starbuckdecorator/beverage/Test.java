package designpattern.decoratorspattern.starbuckdecorator.beverage;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:38 AM ,March 29,2021
 */
public class Test {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a message: ");
        String message = "/admin,/admin/competition/category,/admin/competition/list,/admin/course-plan,/admin/course/index,/admin/courseCategory,/admin/courseware,/admin/document/category,/admin/document/category/list,/admin/events/category/list,/admin/events/list,/admin/news/category/list,/admin/news/list,/admin/question/category,/admin/question/list,/admin/report/list,/admin/setting/permission,/admin/setting/permission/list,/admin/setting/user,/admin/test/list,/admin/test/testkit,COMPETITION_CATEGORY_DELETE,COMPETITION_CATEGORY_GET,COMPETITION_CATEGORY_POST,COMPETITION_CATEGORY_PUT,COMPETITION_DELETE,COMPETITION_GET,COMPETITION_POST,COMPETITION_PUT,COURSEWARE_DELETE,COURSEWARE_GET,COURSEWARE_POST,COURSEWARE_PUT,COURSE_CATEGORY_DELETE,COURSE_CATEGORY_GET,COURSE_CATEGORY_POST,COURSE_CATEGORY_PUT,COURSE_DELETE,COURSE_GET,COURSE_PLAN_DELETE,COURSE_PLAN_GET,COURSE_PLAN_POST,COURSE_PLAN_PUT,COURSE_POST,COURSE_PUT,DOCUMENT_CATEGORY_DELETE,DOCUMENT_CATEGORY_GET,DOCUMENT_CATEGORY_POST,DOCUMENT_CATEGORY_PUT,DOCUMENT_DELETE,DOCUMENT_GET,DOCUMENT_POST,DOCUMENT_PUT,EVENT_CATEGORY_DELETE,EVENT_CATEGORY_GET,EVENT_CATEGORY_POST,EVENT_CATEGORY_PUT,EVENT_DELETE,EVENT_GET,EVENT_POST,EVENT_PUT,NEWS_CATEGORY_DELETE,NEWS_CATEGORY_GET,NEWS_CATEGORY_POST,NEWS_CATEGORY_PUT,NEWS_DELETE,NEWS_GET,NEWS_POST,NEWS_PUT,PERMISSION_LIST_DELETE,PERMISSION_LIST_GET,PERMISSION_LIST_POST,PERMISSION_LIST_PUT,QUESTION_CATEGORY_DELETE,QUESTION_CATEGORY_GET,QUESTION_CATEGORY_POST,QUESTION_CATEGORY_PUT,QUESTION_DELETE,QUESTION_GET,QUESTION_POST,QUESTION_PUT,REPORT_DELETE,REPORT_GET,REPORT_POST,REPORT_PUT,ROLE_DELETE,ROLE_GET,ROLE_POST,ROLE_PUT,ROLE_SUPER_ADMIN,TESTKIT_DELETE,TESTKIT_GET,TESTKIT_POST,TESTKIT_PUT,TEST_DELETE,TEST_GET,TEST_POST,TEST_PUT,USER_DELETE,USER_GET,USER_POST,USER_PUT,null_DELETE,null_GET,null_POST,null_PUT";
        byte[] messageBytes = message.getBytes();
        
        System.out.println("Before: " + message);
        // Display message in binary
        for (int i = 0; i < messageBytes.length; i++) {
            System.out.print(Integer.toBinaryString(messageBytes[i]));
        }
        System.out.println();
        
        // OR each byte by 1 as an example of bit manipulation
        for (int i = 0; i < messageBytes.length; i++) {
            messageBytes[i] |= 1;
        }
        
        System.out.println("After : " + new String(messageBytes));
        // Display message in binary
        for (int i = 0; i < messageBytes.length; i++) {
            System.out.print(Integer.toBinaryString(messageBytes[i]) + " ");
        }
        System.out.println();
    }
}
