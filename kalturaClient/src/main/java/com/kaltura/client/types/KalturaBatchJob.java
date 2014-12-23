// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2011  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.enums.KalturaBatchJobType;
import com.kaltura.client.enums.KalturaBatchJobStatus;
import com.kaltura.client.enums.KalturaBatchJobErrorTypes;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 17 Aug 12 06:33:26 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class KalturaBatchJob extends KalturaBaseJob {
    public String entryId;
    public String entryName;
    public KalturaBatchJobType jobType;
    public int jobSubType = Integer.MIN_VALUE;
    public int onStressDivertTo = Integer.MIN_VALUE;
    public KalturaJobData data;
    public KalturaBatchJobStatus status;
    public int abort = Integer.MIN_VALUE;
    public int checkAgainTimeout = Integer.MIN_VALUE;
    public int progress = Integer.MIN_VALUE;
    public String message;
    public String description;
    public int updatesCount = Integer.MIN_VALUE;
    public int priority = Integer.MIN_VALUE;
	/**  The id of identical job     */
    public int twinJobId = Integer.MIN_VALUE;
	/**  The id of the bulk upload job that initiated this job     */
    public int bulkJobId = Integer.MIN_VALUE;
	/**  When one job creates another - the parent should set this parentJobId to be its
	  own id.     */
    public int parentJobId = Integer.MIN_VALUE;
	/**  The id of the root parent job     */
    public int rootJobId = Integer.MIN_VALUE;
	/**  The time that the job was pulled from the queue     */
    public int queueTime = Integer.MIN_VALUE;
	/**  The time that the job was finished or closed as failed     */
    public int finishTime = Integer.MIN_VALUE;
    public KalturaBatchJobErrorTypes errType;
    public int errNumber = Integer.MIN_VALUE;
    public int fileSize = Integer.MIN_VALUE;
    public boolean lastWorkerRemote;
    public int schedulerId = Integer.MIN_VALUE;
    public int workerId = Integer.MIN_VALUE;
    public int batchIndex = Integer.MIN_VALUE;
    public int lastSchedulerId = Integer.MIN_VALUE;
    public int lastWorkerId = Integer.MIN_VALUE;
    public int dc = Integer.MIN_VALUE;

    public KalturaBatchJob() {
    }

    public KalturaBatchJob(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("entryName")) {
                this.entryName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("jobType")) {
                this.jobType = KalturaBatchJobType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("jobSubType")) {
                this.jobSubType = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("onStressDivertTo")) {
                this.onStressDivertTo = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("data")) {
                this.data = ParseUtils.parseObject(KalturaJobData.class, aNode);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = KalturaBatchJobStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("abort")) {
                this.abort = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("checkAgainTimeout")) {
                this.checkAgainTimeout = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("progress")) {
                this.progress = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("message")) {
                this.message = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("updatesCount")) {
                this.updatesCount = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("priority")) {
                this.priority = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("twinJobId")) {
                this.twinJobId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("bulkJobId")) {
                this.bulkJobId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("parentJobId")) {
                this.parentJobId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("rootJobId")) {
                this.rootJobId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("queueTime")) {
                this.queueTime = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("finishTime")) {
                this.finishTime = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("errType")) {
                this.errType = KalturaBatchJobErrorTypes.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("errNumber")) {
                this.errNumber = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("fileSize")) {
                this.fileSize = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastWorkerRemote")) {
                this.lastWorkerRemote = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("schedulerId")) {
                this.schedulerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("workerId")) {
                this.workerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("batchIndex")) {
                this.batchIndex = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastSchedulerId")) {
                this.lastSchedulerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastWorkerId")) {
                this.lastWorkerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("dc")) {
                this.dc = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaBatchJob");
        kparams.add("entryId", this.entryId);
        kparams.add("entryName", this.entryName);
        kparams.add("jobSubType", this.jobSubType);
        kparams.add("onStressDivertTo", this.onStressDivertTo);
        kparams.add("data", this.data);
        kparams.add("status", this.status);
        kparams.add("abort", this.abort);
        kparams.add("checkAgainTimeout", this.checkAgainTimeout);
        kparams.add("progress", this.progress);
        kparams.add("message", this.message);
        kparams.add("description", this.description);
        kparams.add("updatesCount", this.updatesCount);
        kparams.add("priority", this.priority);
        kparams.add("twinJobId", this.twinJobId);
        kparams.add("bulkJobId", this.bulkJobId);
        kparams.add("parentJobId", this.parentJobId);
        kparams.add("rootJobId", this.rootJobId);
        kparams.add("queueTime", this.queueTime);
        kparams.add("finishTime", this.finishTime);
        kparams.add("errType", this.errType);
        kparams.add("errNumber", this.errNumber);
        kparams.add("fileSize", this.fileSize);
        kparams.add("lastWorkerRemote", this.lastWorkerRemote);
        kparams.add("schedulerId", this.schedulerId);
        kparams.add("workerId", this.workerId);
        kparams.add("batchIndex", this.batchIndex);
        kparams.add("lastSchedulerId", this.lastSchedulerId);
        kparams.add("lastWorkerId", this.lastWorkerId);
        kparams.add("dc", this.dc);
        return kparams;
    }

}

