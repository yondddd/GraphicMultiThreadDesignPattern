package com.gmtdp.p12_activeObject.exercise2_1.activeobject;

class RealResult<T> extends Result<T> {
	private final T resultVaule;

	public RealResult(T resultVaule) {
		this.resultVaule = resultVaule;
	}
	
	public T getResultValue() {
		return resultVaule;
	}
	
}
