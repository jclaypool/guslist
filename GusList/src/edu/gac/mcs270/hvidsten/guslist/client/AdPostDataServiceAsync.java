package edu.gac.mcs270.hvidsten.guslist.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.gac.mcs270.hvidsten.guslist.shared.PostData;

public interface AdPostDataServiceAsync {
	public void addPostDataToServer(PostData post, AsyncCallback<Void> callback);
}
