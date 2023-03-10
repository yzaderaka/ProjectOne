package Class24;

public class Task1 {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */


    class Computer {
        int ram;
        int storage;
        String os;

        void playVideo() {
            System.out.println("Video is playing");
        }

        void browserInternet() {
            System.out.println("Browse the internet");
        }
    }

    class Apple extends Computer {
        @Override
        void playVideo() {
            System.out.println("Video is playing on VLC player");
        }

        @Override
        void browserInternet() {
            System.out.println("Browsing internet using Safari");
        }

        void installAPPs() {
            System.out.println("Installing apps from AppStore");
        }
    }

    class Dell extends Computer {
        @Override
        void browserInternet() {
            System.out.println("Browsing internet using Chrome");
        }

        @Override
        void playVideo() {
            System.out.println("Video is playing on Windows Media Player");
        }
    }
}
