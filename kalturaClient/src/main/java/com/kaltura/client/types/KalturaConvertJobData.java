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
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 09 Apr 13 06:52:58 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class KalturaConvertJobData extends KalturaConvartableJobData {
    public String destFileSyncLocalPath;
    public String destFileSyncRemoteUrl;
    public String logFileSyncLocalPath;
    public String logFileSyncRemoteUrl;
    public String flavorAssetId;
    public String remoteMediaId;
    public String customData;

    public KalturaConvertJobData() {
    }

    public KalturaConvertJobData(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("destFileSyncLocalPath")) {
                this.destFileSyncLocalPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("destFileSyncRemoteUrl")) {
                this.destFileSyncRemoteUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("logFileSyncLocalPath")) {
                this.logFileSyncLocalPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("logFileSyncRemoteUrl")) {
                this.logFileSyncRemoteUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("flavorAssetId")) {
                this.flavorAssetId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("remoteMediaId")) {
                this.remoteMediaId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("customData")) {
                this.customData = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaConvertJobData");
        kparams.add("destFileSyncLocalPath", this.destFileSyncLocalPath);
        kparams.add("destFileSyncRemoteUrl", this.destFileSyncRemoteUrl);
        kparams.add("logFileSyncLocalPath", this.logFileSyncLocalPath);
        kparams.add("logFileSyncRemoteUrl", this.logFileSyncRemoteUrl);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("remoteMediaId", this.remoteMediaId);
        kparams.add("customData", this.customData);
        return kparams;
    }

}

