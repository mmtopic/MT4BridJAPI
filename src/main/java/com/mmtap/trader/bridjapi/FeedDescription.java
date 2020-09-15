package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:789</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class FeedDescription extends StructObject {
	static {
		BridJ.register();
	}
	/** data source version */
	@Field(0) 
	public int version() {
		return this.io.getIntField(this, 0);
	}
	/** data source version */
	@Field(0) 
	public FeedDescription version(int version) {
		this.io.setIntField(this, 0, version);
		return this;
	}
	/**
	 * data source name<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(1) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * copyright string<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(2) 
	public Pointer<Byte > copyright() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * data source web<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(3) 
	public Pointer<Byte > web() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * data source email<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(4) 
	public Pointer<Byte > email() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * feeder server<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(5) 
	public Pointer<Byte > server() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * default feeder name<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(6) 
	public Pointer<Byte > username() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * default feeder password<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(7) 
	public Pointer<Byte > userpass() {
		return this.io.getPointerField(this, 7);
	}
	/** feeder modes (enum FeederModes) */
	@Field(8) 
	public int modes() {
		return this.io.getIntField(this, 8);
	}
	/** feeder modes (enum FeederModes) */
	@Field(8) 
	public FeedDescription modes(int modes) {
		this.io.setIntField(this, 8, modes);
		return this;
	}
	/**
	 * feeder description<br>
	 * C type : char[512]
	 */
	@Array({512}) 
	@Field(9) 
	public Pointer<Byte > description() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * datafeed name in license<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(10) 
	public Pointer<Byte > module() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * reserved<br>
	 * C type : int[54]
	 */
	@Array({54}) 
	@Field(11) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 11);
	}
	public FeedDescription() {
		super();
	}
	public FeedDescription(Pointer pointer) {
		super(pointer);
	}
}