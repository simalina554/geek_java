
import java.util.*;

class noutbuk {
    private String model_;
    private int obemOZU;
    private int obemZD;
    private String sistem_;
    private String color;

    public noutbuk(String model_, int obemOZU, int obemZD, String sistem_, String color) {
        this.model_ = model_;
        this.obemOZU = obemOZU;
        this.obemZD = obemZD;
        this.sistem_ = sistem_;
        this.color = color;
    }

    public String getmodel_() {
        return model_;
    }

    public int getobemOZU() {
        return obemOZU;
    }

    public int getobemZD() {
        return obemZD;
    }

    public String getsistem_() {
        return sistem_;
    }

    public String getcolor() {
        return color;
    }

    @Override
    public String toString() {
        return "noutbuk{" +
                "model_='" + model_ + '\'' +
                ", obemOZU=" + obemOZU +
                ", obemZD=" + obemZD +
                ", sistem_='" + sistem_ + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<noutbuk> noutbuk = new ArrayList<>();
        noutbuk.add(new noutbuk("Dell", 8, 512, "Windows 10", "Серый"));
        noutbuk.add(new noutbuk("HP", 16, 1024, "Windows 11", "Черный"));
        noutbuk.add(new noutbuk("Lenovo", 4, 256, "Windows 10", "Серебристый"));

        Map<String, String> criterrii = new HashMap<>();
        criterrii.put("obemOZU", "8");
        criterrii.put("obemZD", "512");
        criterrii.put("sistem_", "Windows 10");
        criterrii.put("color", "Серый");

        filter.noutbuk(noutbuk, criterrii);
    }

    private static void filter_noutbukи(List<noutbuk> noutbuk, Map<String, String> criterrii) {
        for (noutbuk noutbuk : noutbuk) {
            boolean podxodit = true;
            for (Map.Entry<String, String> entry : criterrii.entrySet()) {
                String criterri = entry.getKey();
                String key = entry.getValue();
                if (! soonvKrit(noutbuk, criterrii, key)) {
                    podxodit = false;
                    break;
                }
            }
            if (podxodit) {
                System.out.println(noutbuk);
            }
        }
    }

    private static boolean soonvKrit(noutbuk noutbuk, String criterrii, String key) {
        switch (criterri) {
            case "obemOZU":
                return noutbuk.getobemOZU() >= Integer.parseInt(key);
            case "obemZD":
                return noutbuk.getobemZD() >= Integer.parseInt(key);
            case "sistem_":
                return noutbuk.getsistem_().equals(key);
            case "color":
                return noutbuk.getcolor().equals(key);
            default:
                return false;
        }
    }
}