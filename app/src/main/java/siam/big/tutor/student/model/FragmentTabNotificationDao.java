package siam.big.tutor.student.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by supaj571 on 12/12/2560.
 */

public class FragmentTabNotificationDao {

    List<FragmentTabNotificationItemDao> data = new ArrayList<>();

    public List<FragmentTabNotificationItemDao> getData() {
        return data;
    }

    public void addData(FragmentTabNotificationItemDao data){
        this.data.add(data);
    }

    public static class FragmentTabNotificationItemDao{
        int id;
        String date;
        String title;
        String detail;

        public FragmentTabNotificationItemDao(int id, String date, String title, String detail) {
            this.id = id;
            this.date = date;
            this.title = title;
            this.detail = detail;
        }

        public int getId() {
            return id;
        }

        public String getDate() {
            return date;
        }

        public String getTitle() {
            return title;
        }

        public String getDetail() {
            return detail;
        }
    }
}
