package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicField = 1;
        accessData.publicMethod();

//        accessData.defaultField = 2;
//        accessData.defaultMethod();

//        accessData.privateMethod();

        accessData.innerAccess();
    }
}
