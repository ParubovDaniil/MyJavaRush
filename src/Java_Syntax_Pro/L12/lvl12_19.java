package Java_Syntax_Pro.L12;
import java.util.Objects;
public class lvl12_19 {}
/*
Яблоки бывают разные
*/
class Solution19 {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Pineapple", "piPhone Z");
        CellPhone cellPhone2 = new CellPhone("Pineapple", "piPhone Z");
        if (cellPhone1.equals(cellPhone2)) {
            System.out.println("телефоны одинаковые");
        }
    }
}
class CellPhone {
    String vendor;
    String model;

    public CellPhone(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CellPhone cellPhone = (CellPhone) o;
        return Objects.equals(vendor, cellPhone.vendor) &&
                Objects.equals(model, cellPhone.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vendor, model);
    }
}
/*
Исправь ошибку в коде, чтобы программа вывела на экран фразу: "телефоны одинаковые".

Требования:
•	В консоли должна выводиться фраза "телефоны одинаковые".
*/