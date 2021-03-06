package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:650</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class ConPlugin extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * plugin file name<br>
	 * C type : char[256]
	 */
	@Array({256}) 
	@Field(0) 
	public Pointer<Byte > file() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * plugin description<br>
	 * C type : PluginInfo
	 */
	@Field(1) 
	public PluginInfo info() {
		return this.io.getNativeObjectField(this, 1);
	}
	/**
	 * plugin description<br>
	 * C type : PluginInfo
	 */
	@Field(1) 
	public ConPlugin info(PluginInfo info) {
		this.io.setNativeObjectField(this, 1, info);
		return this;
	}
	/** plugin enabled/disabled */
	@Field(2) 
	public int enabled() {
		return this.io.getIntField(this, 2);
	}
	/** plugin enabled/disabled */
	@Field(2) 
	public ConPlugin enabled(int enabled) {
		this.io.setIntField(this, 2, enabled);
		return this;
	}
	/** is plugin configurable */
	@Field(3) 
	public int configurable() {
		return this.io.getIntField(this, 3);
	}
	/** is plugin configurable */
	@Field(3) 
	public ConPlugin configurable(int configurable) {
		this.io.setIntField(this, 3, configurable);
		return this;
	}
	/** plugin can be accessed from manager terminal */
	@Field(4) 
	public int manager_access() {
		return this.io.getIntField(this, 4);
	}
	/** plugin can be accessed from manager terminal */
	@Field(4) 
	public ConPlugin manager_access(int manager_access) {
		this.io.setIntField(this, 4, manager_access);
		return this;
	}
	/**
	 * reserved<br>
	 * C type : int[62]
	 */
	@Array({62}) 
	@Field(5) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 5);
	}
	public ConPlugin() {
		super();
	}
	public ConPlugin(Pointer pointer) {
		super(pointer);
	}
}
