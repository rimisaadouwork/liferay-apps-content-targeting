/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.contenttargeting.reports.campaigncontent.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CampaignContent service. Represents a row in the &quot;ContentTargeting_CampaignContentReport_CampaignContent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignContent
 * @see com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentImpl
 * @see com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentModelImpl
 * @generated
 */
public interface CampaignContentModel extends BaseModel<CampaignContent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a campaign content model instance should use the {@link CampaignContent} interface instead.
	 */

	/**
	 * Returns the primary key of this campaign content.
	 *
	 * @return the primary key of this campaign content
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this campaign content.
	 *
	 * @param primaryKey the primary key of this campaign content
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the campaign content ID of this campaign content.
	 *
	 * @return the campaign content ID of this campaign content
	 */
	public long getCampaignContentId();

	/**
	 * Sets the campaign content ID of this campaign content.
	 *
	 * @param campaignContentId the campaign content ID of this campaign content
	 */
	public void setCampaignContentId(long campaignContentId);

	/**
	 * Returns the campaign ID of this campaign content.
	 *
	 * @return the campaign ID of this campaign content
	 */
	public long getCampaignId();

	/**
	 * Sets the campaign ID of this campaign content.
	 *
	 * @param campaignId the campaign ID of this campaign content
	 */
	public void setCampaignId(long campaignId);

	/**
	 * Returns the class name of this campaign content.
	 *
	 * @return the class name of this campaign content
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this campaign content.
	 *
	 * @param className the class name of this campaign content
	 */
	public void setClassName(String className);

	/**
	 * Returns the class p k of this campaign content.
	 *
	 * @return the class p k of this campaign content
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this campaign content.
	 *
	 * @param classPK the class p k of this campaign content
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the event type of this campaign content.
	 *
	 * @return the event type of this campaign content
	 */
	@AutoEscape
	public String getEventType();

	/**
	 * Sets the event type of this campaign content.
	 *
	 * @param eventType the event type of this campaign content
	 */
	public void setEventType(String eventType);

	/**
	 * Returns the count of this campaign content.
	 *
	 * @return the count of this campaign content
	 */
	public int getCount();

	/**
	 * Sets the count of this campaign content.
	 *
	 * @param count the count of this campaign content
	 */
	public void setCount(int count);

	/**
	 * Returns the modified date of this campaign content.
	 *
	 * @return the modified date of this campaign content
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this campaign content.
	 *
	 * @param modifiedDate the modified date of this campaign content
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CampaignContent campaignContent);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CampaignContent> toCacheModel();

	@Override
	public CampaignContent toEscapedModel();

	@Override
	public CampaignContent toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}