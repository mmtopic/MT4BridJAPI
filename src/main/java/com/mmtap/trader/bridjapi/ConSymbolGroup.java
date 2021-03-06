package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:602</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class ConSymbolGroup extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * group name<br>
	 * C type : char[16]
	 */
	@Array({16}) 
	@Field(0) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * group description<br>
	 * C type : char[64]
	 */
	@Array({64}) 
	@Field(1) 
	public Pointer<Byte > description() {
		return this.io.getPointerField(this, 1);
	}
	public ConSymbolGroup() {
		super();
	}
	public ConSymbolGroup(Pointer pointer) {
		super(pointer);
	}
}
