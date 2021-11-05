public class Space {
    public static void main(String[] args) {
        String[] month = {"Январь", "Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        String result="";
        for (int i=0; i<month.length;i++) {
            if (i<month.length-1) {
            result+=month[i]+", ";
            } else result+=month[i]+".";
        }
        System.out.println(result);

        }
}
