package tugas2;

public class NodeFilm {
        int id;
        String title;
        double rating;
        NodeFilm prev;
        NodeFilm next;
    
        public NodeFilm(int id, String title, double rating) {
            this.id = id;
            this.title = title;
            this.rating = rating;
        }
}