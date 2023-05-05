public class LisansUstu extends Seviye{ //role2

    @Override
    public boolean mezuniyet(int not) {
        if(not>3) return true;
        else return false;

    }
}
