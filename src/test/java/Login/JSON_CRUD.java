//package Login;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.type.TypeReference;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//
//class User {
//    public int id;
//    public String name;
//    public String email;
//
//    // Constructors, getters, setters can be added as needed
//}
//public class Jackson_CRUD {
//    private static final String FILE_PATH = "data.json";
//    private static ObjectMapper mapper = new ObjectMapper();
//
//    // CREATE
//    public static void createData() {
//        List<User> users = new ArrayList<>();
//        User user = new User();
//        user.id = 1;
//        user.name = "Alice";
//        user.email = "alice@example.com";
//        users.add(user);
//
//        try {
//            mapper.writeValue(new File(FILE_PATH), users);
//            System.out.println("Data written successfully");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // READ
//    public static void readData() {
//        try {
//            List<User> users = mapper.readValue(new File(FILE_PATH), new TypeReference<List<User>>(){});
//            for (User user : users) {
//                System.out.println("ID: " + user.id);
//                System.out.println("Name: " + user.name);
//                System.out.println("Email: " + user.email);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // UPDATE
//    public static void updateData(int userId, String newEmail) {
//        try {
//            List<User> users = mapper.readValue(new File(FILE_PATH), new TypeReference<List<User>>(){});
//            for (User user : users) {
//                if (user.id == userId) {
//                    user.email = newEmail;
//                    break;
//                }
//            }
//            mapper.writeValue(new File(FILE_PATH), users);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // DELETE
//    public static void deleteData(int userId) {
//        try {
//            List<User> users = mapper.readValue(new File(FILE_PATH), new TypeReference<List<User>>(){});
//            users.removeIf(user -> user.id == userId);
//            mapper.writeValue(new File(FILE_PATH), users);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Main method to test
//    public static void main(String[] args) {
//        createData();
//        readData();
//        updateData(1, "alice_new@example.com");
//        readData();
//        deleteData(1);
//        readData();
//    }
//}
