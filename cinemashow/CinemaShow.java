

public class CinemaShow {

        private String title;
        private int seatAvailable;
        private final int capacity;


        private static int totalBooked=0;
        
        CinemaShow(String title, int capacity)
        {

            this.title=title;
            this.capacity=capacity;
            this.seatAvailable=capacity;
        }

         CinemaShow(String title) {
            this(title, 100);
        }

        

    }    public static void main(String[] args) {
        
    }
}
