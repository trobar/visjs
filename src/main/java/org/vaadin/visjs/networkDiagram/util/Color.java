package org.vaadin.visjs.networkDiagram.util;

/**
 * Created by roshans on 10/22/14.
 * Added opacity property by Martin Prause 5.8.2017
 */
public class Color {

    private String hover;
    private String highlight = "#D2E5FF";
    private String border = "#2B7CE9";
    private String background = "#97C2FC";
    private String color = "#df6b1d";
    private int opacity =1;

    public Color() {
    }

    public Color(String color) {
        this.color = color;
    }

    public Color(String backgroundColor, String highlightColor) {
        this.background = backgroundColor;
        this.highlight = highlightColor;
    }

    public Color(String backgroundColor, String hoverColor, String highlightColor) {
        this.background = backgroundColor;
        this.highlight = highlightColor;
        this.hover = hoverColor;
    }

    public Color(String backgroundColor, String hoverColor, String highlightColor, String borderColor) {
        this.background = backgroundColor;
        this.hover = hoverColor;
        this.highlight = highlightColor;
        this.border = borderColor;
    }
    
    

    public int getOpacity() {
		return opacity;
	}

	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}

	public String getHoverColor() {
        return hover;
    }

    public void setHoverColor(String hover) {
        this.hover = hover;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlightColor(String highlight) {
        this.highlight = highlight;
    }

    public String getBorderColor() {
        return border;
    }

    public void setBorderColor(String border) {
        this.border = border;
    }

    public String getBackgroundColor() {
        return background;
    }

    public void setBackgroundColor(String background) {
        this.background = background;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	public String getHover() {
		return hover;
	}

	public void setHover(String hover) {
		this.hover = hover;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public void setHighlight(String highlight) {
		this.highlight = highlight;
	}
    
    
}
