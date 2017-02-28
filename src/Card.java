package src;

/**
 * Created by vajni on 2017.02.28..
 */
public class Card {

    byte breastSize;
    byte usableHoles;
    byte partnerCapacity;
    double price;

    public Card(byte breastSize, byte usableHoles, byte partnerCapacity, double price) {
        this.breastSize = breastSize;
        this.usableHoles = usableHoles;
        this.partnerCapacity = partnerCapacity;
        this.price = price;
    }

    public byte getBreastSize() {
        return breastSize;
    }

    public byte getUsableHoles() {
        return usableHoles;
    }

    public byte getPartnerCapacity() {
        return partnerCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Card{" +
                "breastSize=" + breastSize +
                ", usableHoles=" + usableHoles +
                ", partnerCapacity=" + partnerCapacity +
                ", price=" + price +
                '}';
    }
}
