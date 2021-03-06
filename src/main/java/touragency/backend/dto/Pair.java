package touragency.backend.dto;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Pair {
    private String label;
    private String text;

    public Pair(String label, String text) {
        this.label = label;
        this.text = text;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
