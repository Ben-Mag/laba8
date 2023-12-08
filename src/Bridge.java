interface Massages {
    void setMassages();
}
abstract class Masseur {
    protected Massages massages;
    public Masseur(Massage massages){
        this.massages = (Massages) massages;
    }
    abstract public void setMassages();
}
class HealthMasseur extends Masseur {
    public HealthMasseur(Massages massages) {
        super((Massage) massages);
    }
    public void setMassages() {
        System.out.print("HealthMasseur: ");
        massages.setMassages();
    }
}
class ManualMasseur extends Masseur {
    public ManualMasseur(Massages massages) {
        super((Massage) massages);
    }
    public void setMassages() {
        System.out.print("ManualMasseur: ");
        massages.setMassages();
    }
}
class BackMassages implements Massages {
    public void setMassages(){
        System.out.println("massage of back");
    }
}
class LegsMassages implements Massages {
    public void setMassages(){
        System.out.println("massage of legs");
    }
}
public class Bridge {

}