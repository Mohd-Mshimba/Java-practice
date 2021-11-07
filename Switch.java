public class Switch{
    public static void main(String []args){
       int grade = 45;
       switch (grade) {
        case 35:
            System.out.print("F");
            break;

        case 45:
            System.out.print("C");
            break;

        case 50:
            System.out.print("B");
            break;
       
           default:
           System.out.print("NOTHING");
            break;
       }
    }
}