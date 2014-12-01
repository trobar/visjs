package org.vaadin.visjs.networkDiagram;

import com.google.gson.JsonObject;
import com.vaadin.ui.Component;

/**
 * Created by roshans on 10/10/14.
 */
public class Edge {

    private int from;
    private int to;
    private int value;
    private int stabilizationIterations = 1000;

    private boolean allowedToMove;
    private boolean parseColor;
    private boolean clickToUse = false;
    private boolean configurePhysics = false;
    private boolean freezeForStabilization = false;
    private boolean hover = false;
    private boolean dragNetwork = true ;
    private boolean dragNodes = true;
    private boolean hideNodesOnDrag = false;
    private boolean hideEdgesOnDrag = false;
    private boolean selectable = true;
    private boolean stabilize = true;
    private boolean zoomable = true;

    private String label;
    private String title;
    private int width;
    private Color color;

    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStabilizationIterations() {
        return stabilizationIterations;
    }

    public void setStabilizationIterations(int stabilizationIterations) {
        this.stabilizationIterations = stabilizationIterations;
    }

    public boolean isAllowedToMove() {
        return allowedToMove;
    }

    public void setAllowedToMove(boolean allowedToMove) {
        this.allowedToMove = allowedToMove;
    }

    public boolean isParseColor() {
        return parseColor;
    }

    public void setParseColor(boolean parseColor) {
        this.parseColor = parseColor;
    }

    public boolean isClickToUse() {
        return clickToUse;
    }

    public void setClickToUse(boolean clickToUse) {
        this.clickToUse = clickToUse;
    }

    public boolean isConfigurePhysics() {
        return configurePhysics;
    }

    public void setConfigurePhysics(boolean configurePhysics) {
        this.configurePhysics = configurePhysics;
    }

    public boolean isFreezeForStabilization() {
        return freezeForStabilization;
    }

    public void setFreezeForStabilization(boolean freezeForStabilization) {
        this.freezeForStabilization = freezeForStabilization;
    }

    public boolean isHover() {
        return hover;
    }

    public void setHover(boolean hover) {
        this.hover = hover;
    }

    public boolean isDragNetwork() {
        return dragNetwork;
    }

    public void setDragNetwork(boolean dragNetwork) {
        this.dragNetwork = dragNetwork;
    }

    public boolean isDragNodes() {
        return dragNodes;
    }

    public void setDragNodes(boolean dragNodes) {
        this.dragNodes = dragNodes;
    }

    public boolean isHideNodesOnDrag() {
        return hideNodesOnDrag;
    }

    public void setHideNodesOnDrag(boolean hideNodesOnDrag) {
        this.hideNodesOnDrag = hideNodesOnDrag;
    }

    public boolean isHideEdgesOnDrag() {
        return hideEdgesOnDrag;
    }

    public void setHideEdgesOnDrag(boolean hideEdgesOnDrag) {
        this.hideEdgesOnDrag = hideEdgesOnDrag;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public void setSelectable(boolean selectable) {
        this.selectable = selectable;
    }

    public boolean isStabilize() {
        return stabilize;
    }

    public void setStabilize(boolean stabilize) {
        this.stabilize = stabilize;
    }

    public boolean isZoomable() {
        return zoomable;
    }

    public void setZoomable(boolean zoomable) {
        this.zoomable = zoomable;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void addEdgeClickListener(){

    }

    public static enum Style {
        line("line"),
        Arrow("arrow"),
        ArrowCenter("arrow-center"),
        DashLine("dash-line");

        private String style;

        Style(String style) {
            this.style = style;
        }

        @Override
        public String toString() {
            return this.style;
        }
    }
}