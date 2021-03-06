package graph;

import java.io.Serializable;

public class PlotParams implements Serializable, Cloneable {
	
	private static final long serialVersionUID = -1181349057572412809L;
	public double width = 600;
	public double height = 400;
	public double xmin = -10;
	public double xmax = 10;
	public double ymin = -10;
	public double ymax = 10;
	public String xlabel;
	public String ylabel;
	public String title;
	public double xscale = 1;
	public double yscale = 1;
	public int xtics = 10;
	public int ytics = 10;
	public double left = 50, right = 50, top = 50, bottom = 50;
	public boolean lines = true, points = true;
	
	public PlotParams() {
	}
	
	public PlotParams(double xmin, double xmax, double ymin, double ymax) {
		range(xmin, xmax, ymin, ymax);
	}
	
	public PlotParams clone() {
		try {
			return (PlotParams)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(e);
		}
	}

	public PlotParams lines(boolean lines) {
		this.lines = lines;
		return this;
	}

	public PlotParams points(boolean points) {
		this.points = points;
		return this;
	}
	
	public PlotParams lines() {
		this.lines = true;
		this.points = false;
		return this;
	}
	
	public PlotParams points() {
		this.points = true;
		this.lines = false;
		return this;
	}
	
	public PlotParams scatter() {
		this.points = true;
		this.lines = true;
		return this;
	}

	public PlotParams left(double left) {
		this.left = left;
		return this;
	}
	
	public PlotParams right(double right) {
		this.right = right;
		return this;
	}
	
	public PlotParams top(double top) {
		this.top = top;
		return this;
	}
	
	public PlotParams bottom(double bottom) {
		this.bottom = bottom;
		return this;
	}
	
	public PlotParams xtics(int xtics) {
		this.xtics = xtics;
		return this;
	}
	
	public PlotParams ytics(int ytics) {
		this.ytics = ytics;
		return this;
	}
	
	public PlotParams width(double width) {
		this.width = width;
		return this;
	}
	
	public PlotParams height(double height) {
		this.height = height;
		return this;
	}
	
	public PlotParams size(double width, double height) {
		this.width = width;
		this.height = height;
		return this;
	}
	
	public PlotParams xmin(double xmin) {
		this.xmin = xmin;
		return this;
	}
	
	public PlotParams xmax(double xmax) {
		this.xmax = xmax;
		return this;
	}
	
	public PlotParams xrange(double xmin, double xmax) {
		this.xmin = xmin;
		this.xmax = xmax;
		return this;
	}
	
	public PlotParams ymin(double ymin) {
		this.ymin = ymin;
		return this;
	}
	
	public PlotParams ymax(double ymax) {
		this.ymax = ymax;
		return this;
	}
	
	public PlotParams yrange(double ymin, double ymax) {
		this.ymin = ymin;
		this.ymax = ymax;
		return this;
	}
	
	public PlotParams range(double xmin, double xmax, double ymin, double ymax) {
		this.ymax = ymax;
		this.ymin = ymin;
		this.xmax = xmax;
		this.xmin = xmin;
		return this;
	}
	
	public PlotParams xscale(double xscale) {
		this.xscale = xscale;
		return this;
	}
	
	public PlotParams yscale(double yscale) {
		this.yscale = yscale;
		return this;
	}
	
	public PlotParams title(String title) {
		this.title = title;
		return this;
	}

	public PlotParams xlabel(String xlabel) {
		this.xlabel = xlabel;
		return this;
	}

	public PlotParams ylabel(String ylabel) {
		this.ylabel = ylabel;
		return this;
	}
	
	public PlotParams label(String xlabel, String ylabel) {
		this.xlabel = xlabel;
		this.ylabel = ylabel;
		return this;
	}
	
	public PlotParams scale(double xscale, double yscale) {
		this.xscale = xscale;
		this.yscale = yscale;
		return this;
	}
	
	public static void main(String[] args) {
		PlotParams p = new PlotParams();
		System.out.println(p);
		String s = Utils.exportObject(p);
		System.out.println(s);
		p = Utils.importObject(s);
		System.out.println(p);
	}
	
	public String toString() {
		return Utils.debugString(this);
	}

}
