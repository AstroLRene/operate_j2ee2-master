package com.maimob.server.utils;

import java.util.List;

import com.maimob.server.db.entity.Operate_reportform;

public class UserCache {
	public long id;
	public List<Long> channelids = null;
	public List<Long> adminids = null;
	
	List<Operate_reportform> reportform;
}
