abstract class student {
    abstract int getNoOfStudent();
}

class section_905 extends student {

    @Override
    int getNoOfStudent() {
        return 85;
    }
}

class section_906 extends student {

    @Override
    int getNoOfStudent() {
        return 95;
    }
}

public class data_abstraction_w_1 {
    public static void main(String[] args) {
        student st;
        st = new section_905();
        System.out.println("no of student in 905 : " + st.getNoOfStudent());
        st = new section_906();
        System.out.println("no of student in 905 : " + st.getNoOfStudent());
    }
}
