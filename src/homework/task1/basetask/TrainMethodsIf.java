package homework.task1.basetask;

public class TrainMethodsIf {
    public static void main(String[] args) {

    }

    public int returnNewInt(int rni) {
        if (rni < 8) {
            return rni * 7;
        }
        return rni / 4;
    }

    public long returnNewLong(long rni) {
        if (rni > 300) {
            return rni - 300;
        }
        return rni + 20;
    }

    public String returnNewChar(char rni) {
        if (rni == 'g') {
            return rni + "o";
        }
        return "o" + rni;
    }

    public float returnNewFloat(float rni) {
        if (rni == 0.67) {
            return rni;
        }
        return rni * 2;
    }

    public double returnNewDouble(double rni) {
        if (rni > 30 && rni < 80) {
            return rni + 87;
        } else if (rni > 80 && rni < 400) {
            return rni - 87;
        } else if (rni > 400) {
            return rni / 4;
        } else {
            return rni;
        }
    }

    public void returnNewBoolean(boolean rni) {
        if (rni) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}