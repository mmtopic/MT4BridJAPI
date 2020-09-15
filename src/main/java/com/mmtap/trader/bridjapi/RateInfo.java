package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.TimeT;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : MT4ManagerAPI.h:849</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class RateInfo extends StructObject {
	static {
		BridJ.register();
	}
	/** rate time */
	@Field(0) 
	public TimeT ctm() {
		return this.io.getTimeTField(this, 0);
	}
	/** rate time */
	@Field(0) 
	public RateInfo ctm(TimeT ctm) {
		this.io.setTimeTField(this, 0, ctm);
		return this;
	}
	/** open price: 11987=119.87 */
	@Field(1) 
	public int open() {
		return this.io.getIntField(this, 1);
	}
	/** open price: 11987=119.87 */
	@Field(1) 
	public RateInfo open(int open) {
		this.io.setIntField(this, 1, open);
		return this;
	}
	/** high,low,close shift from open */
	@Field(2) 
	public int high() {
		return this.io.getIntField(this, 2);
	}
	/** high,low,close shift from open */
	@Field(2) 
	public RateInfo high(int high) {
		this.io.setIntField(this, 2, high);
		return this;
	}
	/** high,low,close shift from open */
	@Field(3) 
	public int low() {
		return this.io.getIntField(this, 3);
	}
	/** high,low,close shift from open */
	@Field(3) 
	public RateInfo low(int low) {
		this.io.setIntField(this, 3, low);
		return this;
	}
	/** high,low,close shift from open */
	@Field(4) 
	public int close() {
		return this.io.getIntField(this, 4);
	}
	/** high,low,close shift from open */
	@Field(4) 
	public RateInfo close(int close) {
		this.io.setIntField(this, 4, close);
		return this;
	}
	/** volume */
	@Field(5) 
	public double vol() {
		return this.io.getDoubleField(this, 5);
	}
	/** volume */
	@Field(5) 
	public RateInfo vol(double vol) {
		this.io.setDoubleField(this, 5, vol);
		return this;
	}
	public RateInfo() {
		super();
	}
	public RateInfo(Pointer pointer) {
		super(pointer);
	}
}