package domainsystemnotes.enums;

public enum OptionEnum {

    NOTES(1){
        @Override
        public void option() {

        }
    };
    public abstract void option();

    OptionEnum(int option){
        this.option = option;
    }
    private int option;

    public int getOption() {
        return option;
    }
}
