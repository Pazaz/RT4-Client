package javax.media.opengl;

public class GLCapabilities implements Cloneable {

	private boolean doubleBuffered = true;

	private boolean stereo = false;

	private boolean hardwareAccelerated = true;

	private int depthBits = 24;

	private int stencilBits = 0;

	private int redBits = 8;

	private int greenBits = 8;

	private int blueBits = 8;

	private int alphaBits = 0;

	private int accumRedBits = 0;

	private int accumGreenBits = 0;

	private int accumBlueBits = 0;

	private int accumAlphaBits = 0;

	private boolean sampleBuffers = false;

	private int numSamples = 2;

	private boolean pbufferFloatingPointBuffers;

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException var2) {
			throw new GLException(var2);
		}
	}

	public boolean getDoubleBuffered() {
		return this.doubleBuffered;
	}

	public void setDoubleBuffered(boolean arg0) {
		this.doubleBuffered = arg0;
	}

	public boolean getStereo() {
		return this.stereo;
	}

	public void setStereo(boolean arg0) {
		this.stereo = arg0;
	}

	public boolean getHardwareAccelerated() {
		return this.hardwareAccelerated;
	}

	public void setHardwareAccelerated(boolean arg0) {
		this.hardwareAccelerated = arg0;
	}

	public int getDepthBits() {
		return this.depthBits;
	}

	public void setDepthBits(int arg0) {
		this.depthBits = arg0;
	}

	public int getStencilBits() {
		return this.stencilBits;
	}

	public void setStencilBits(int arg0) {
		this.stencilBits = arg0;
	}

	public int getRedBits() {
		return this.redBits;
	}

	public void setRedBits(int arg0) {
		this.redBits = arg0;
	}

	public int getGreenBits() {
		return this.greenBits;
	}

	public void setGreenBits(int arg0) {
		this.greenBits = arg0;
	}

	public int getBlueBits() {
		return this.blueBits;
	}

	public void setBlueBits(int arg0) {
		this.blueBits = arg0;
	}

	public int getAlphaBits() {
		return this.alphaBits;
	}

	public void setAlphaBits(int arg0) {
		this.alphaBits = arg0;
	}

	public int getAccumRedBits() {
		return this.accumRedBits;
	}

	public void setAccumRedBits(int arg0) {
		this.accumRedBits = arg0;
	}

	public int getAccumGreenBits() {
		return this.accumGreenBits;
	}

	public void setAccumGreenBits(int arg0) {
		this.accumGreenBits = arg0;
	}

	public int getAccumBlueBits() {
		return this.accumBlueBits;
	}

	public void setAccumBlueBits(int arg0) {
		this.accumBlueBits = arg0;
	}

	public int getAccumAlphaBits() {
		return this.accumAlphaBits;
	}

	public void setAccumAlphaBits(int arg0) {
		this.accumAlphaBits = arg0;
	}

	public void setSampleBuffers(boolean arg0) {
		this.sampleBuffers = arg0;
	}

	public boolean getSampleBuffers() {
		return this.sampleBuffers;
	}

	public void setNumSamples(int arg0) {
		this.numSamples = arg0;
	}

	public int getNumSamples() {
		return this.numSamples;
	}

	public void setPbufferFloatingPointBuffers(boolean arg0) {
		this.pbufferFloatingPointBuffers = arg0;
	}

	public String toString() {
		return "GLCapabilities [DoubleBuffered: " + this.doubleBuffered + ", Stereo: " + this.stereo + ", HardwareAccelerated: " + this.hardwareAccelerated + ", DepthBits: " + this.depthBits + ", StencilBits: " + this.stencilBits + ", Red: " + this.redBits + ", Green: " + this.greenBits + ", Blue: " + this.blueBits + ", Alpha: " + this.alphaBits + ", Red Accum: " + this.accumRedBits + ", Green Accum: " + this.accumGreenBits + ", Blue Accum: " + this.accumBlueBits + ", Alpha Accum: " + this.accumAlphaBits + ", Multisample: " + this.sampleBuffers + (this.sampleBuffers ? ", Num samples: " + this.numSamples : "") + " ]";
	}
}
