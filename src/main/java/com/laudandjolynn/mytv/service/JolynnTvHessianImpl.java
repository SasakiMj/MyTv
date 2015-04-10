/*******************************************************************************
 * Copyright 2015 htd0324@gmail.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.laudandjolynn.mytv.service;

import java.rmi.RemoteException;

import com.caucho.hessian.server.HessianServlet;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2015年3月25日 下午6:20:06
 * @copyright: www.laudandjolynn.com
 */
public class JolynnTvHessianImpl extends HessianServlet implements JolynnTv {
	private static final long serialVersionUID = 1005559884840488035L;
	private transient JolynnTv jolynnTv = null;

	public JolynnTvHessianImpl(JolynnTv jolynnTv) {
		this.jolynnTv = jolynnTv;
	}

	@Override
	public String getTvStationClassify() throws RemoteException {
		return jolynnTv.getTvStationClassify();
	}

	@Override
	public String getAllTvStation() throws RemoteException {
		return jolynnTv.getAllTvStation();
	}

	@Override
	public String getProgramTable(String name, String date)
			throws RemoteException {
		return jolynnTv.getProgramTable(name, date);
	}

}