/*
 * $Id: LDAPReplicationBusinessHome.java,v 1.1 2006/03/21 12:08:58 tryggvil Exp $
 * Created on Feb 14, 2006
 *
 * Copyright (C) 2006 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.core.ldap.replication.business;

import com.idega.business.IBOHome;


/**
 * 
 *  Last modified: $Date: 2006/03/21 12:08:58 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:eiki@idega.com">eiki</a>
 * @version $Revision: 1.1 $
 */
public interface LDAPReplicationBusinessHome extends IBOHome {

	public LDAPReplicationBusiness create() throws javax.ejb.CreateException, java.rmi.RemoteException;
}
