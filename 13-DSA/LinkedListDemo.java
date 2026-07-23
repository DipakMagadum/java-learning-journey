import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Believer");
        playlist.add("Shape of You");
        playlist.add("Perfect");

        System.out.println("Current Playlist:");
        System.out.println(playlist);

        playlist.addFirst("Thunder");
        playlist.addLast("Counting Stars");

        System.out.println("\nAfter Adding Songs:");
        System.out.println(playlist);

        playlist.remove("Shape of You");

        System.out.println("\nAfter Removing a Song:");
        System.out.println(playlist);

        System.out.println("\nFirst Song:");
        System.out.println(playlist.getFirst());

        System.out.println("\nLast Song:");
        System.out.println(playlist.getLast());

    }

}