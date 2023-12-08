class Factory {
    public Massage getCurrentMassage(String inputos) {
        Massage massage = null;
        if (inputos.equals("head")) {
            massage = new headMassage();
        } else if (inputos.equals("back")) {
            massage = new backMassage();
        } else if (inputos.equals("legs")) {
            massage = new legsMassage();
        }
        return massage;
    }
}
interface Massage {
    String getMassage();
}
class headMassage implements Massage {
    public String getMassage () {
        String s = "Make massage of head";
        System.out.println("Make massage of head");
        return s;
    }
}
class backMassage implements Massage {
    public String getMassage () {
        String s = "Make massage of back";
        System.out.println("Make massage of back");
        return s;
    }
}
class legsMassage implements Massage {
    public String getMassage () {
        String s = "Make massage of legs";
        System.out.println("Make massage of legs");
        return s;
    }
}