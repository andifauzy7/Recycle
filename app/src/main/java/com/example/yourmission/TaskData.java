package com.example.yourmission;

import java.util.ArrayList;

public class TaskData {
    private static String[] heroNames = {
            "Buat Rancangan Database",
            "Membangun SRS Web Freelance",
            "Tugas Use Case Diagram",
            "Survey Statistika",
            "Proposal Himpunan",
            "Rapat Himpunan",
            "Kumpul Angkatan"
    };

    private static String[] heroDetails = {
            "Membuat rancangan database untuk website Freelancer",
            "SRS yang mencakup Usecase, database dan mockup",
            "Membuat use case diagram lengkap antara user dan admin",
            "Melakukan survey ke mahasiswa POLBAN mengenai aplikasi Freelance",
            "Merancang proposal program kerja Himpunan",
            "Rapat membahas kepengurusan Himpunan",
            "Kumpul Angkatan membahas mengenai Kunjungan Industri"
    };

    static ArrayList<Task> getListData() {
        ArrayList<Task> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Task task = new Task();
            task.setName(heroNames[position]);
            task.setDetail(heroDetails[position]);
            list.add(task);
        }
        return list;
    }
}
