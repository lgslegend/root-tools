package com.rarnu.zoe.loving.page;

import android.content.Context;
import android.util.AttributeSet;

import com.rarnu.zoe.loving.R;
import com.rarnu.zoe.loving.base.BasePage;

public class PageImage extends BasePage {

	public PageImage(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	public PageImage(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public PageImage(Context context) {
		super(context);
	}

	@Override
	protected void requireRootLayoutId() {
		this.rootLayout = R.layout.page_image;

	}

	@Override
	protected void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void load(String... param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub

	}

}
