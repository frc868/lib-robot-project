package com.techhounds.lib.trajectory;

public class Trajectory {

	public Segment [] segments;
	
	public Trajectory(Segment [] segments) {
		this.segments = segments;
	}
	
	public Trajectory(int length) {
		this.segments = new Segment[length];
		
		for(Segment seg : segments)
			seg = new Segment();
	}
	
	public static class Segment {
		
		public double pos, vel, acc, jerk, heading, dt, x, y;
		
		public Segment() {
			
		}
		
		public Segment(double pos, double vel, double acc, double jerk, double heading, double dt, double x, double y) {
			this.pos = pos;
			this.vel = vel;
			this.acc = acc;
			this.jerk = jerk;
			this.heading = heading;
			this.dt = dt;
			this.x = x;
			this.y = y;
		}
	}
	
	public Segment getSegment(int index) {
		if(index >= getLength()) {
			return new Segment();
		} else {
			return segments[index];
		}
	}
	
	public int getLength() {
		return segments.length;
	}
}
