package javagoodpatterns.FlyWeight;

public abstract class ChessPiece {
    private String name;
    private String numberPosition;
    private String letterPosition;
    private Color color;

    public String getName() {
        return name;
    }

    public String getNumberPosition() {
        return numberPosition;
    }

    public String getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                this.color = ColorRepository.getWhite();
                break;
        }
    }
}
