package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * ---<br>
 * <i>native declaration : MT4ManagerAPI.h:398</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class LiveInfoFile extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * file name<br>
	 * C type : char[256]
	 */
	@Array({256}) 
	@Field(0) 
	public Pointer<Byte > file() {
		return this.io.getPointerField(this, 0);
	}
	/** file size */
	@Field(1) 
	public int size() {
		return this.io.getIntField(this, 1);
	}
	/** file size */
	@Field(1) 
	public LiveInfoFile size(int size) {
		this.io.setIntField(this, 1, size);
		return this;
	}
	/**
	 * file hash<br>
	 * C type : char[36]
	 */
	@Array({36}) 
	@Field(2) 
	public Pointer<Byte > hash() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * reserved<br>
	 * C type : int[10]
	 */
	@Array({10}) 
	@Field(3) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 3);
	}
	public LiveInfoFile() {
		super();
	}
	public LiveInfoFile(Pointer pointer) {
		super(pointer);
	}
}