package siam.big.tutor.tutor.model.student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by supaj571 on 12/12/2560.
 */

public class TutorSeeStudentDao {

    List<ActivityTutorSeeStudentItemDao> data = new ArrayList<>();

    public List<ActivityTutorSeeStudentItemDao> getData() {
        return data;
    }

    public void addData(ActivityTutorSeeStudentItemDao data){
        this.data.add(data);
    }

    public static class ActivityTutorSeeStudentItemDao{
        int id;
        String date;
        String studentName;
        String courseName;
        String detail;
        float rating;

        public ActivityTutorSeeStudentItemDao(int id, String date, String studentName, String courseName, String detail, float rating) {
            this.id = id;
            this.date = date;
            this.studentName = studentName;
            this.courseName = courseName;
            this.detail = detail;
            this.rating = rating;
        }

        public int getId() {
            return id;
        }

        public String getDate() {
            return date;
        }

        public String getStudentName() {
            return studentName;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getDetail() {
            return detail;
        }

        public float getRating() {
            return rating;
        }
    }
}
