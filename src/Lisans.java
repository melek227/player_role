public class Lisans extends Seviye { //role1
    @Override
    public boolean mezuniyet(int not) {
        if (not > 2) {
            return true;
        } else {
        return false;
       }

    }
}
