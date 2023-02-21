package basetask;

public class TrainMethodsReturn {
    public static void main(String[] args) {

    }

    public int returnNewInt(int rni) {
        return rni * 3;
    }

    public long returnNewLong(long rni) {
        return rni - 4;
    }

    public String returnNewChar(char rni) {
        return "" + rni + rni;
    }

    public float returnNewFloat(float rni) {
        return rni / 2;
    }

    public double returnNewDouble(double rni) {
        return rni + 8;
    }
    public short returnNewShort(short rni) {
        return (short) (rni -1);
    }
    public byte returnNewByte(byte rni) {
        return (byte) (rni * 2);
    }
    public boolean returnNewBoolean(boolean rni) {
        return !rni;
    }
}
