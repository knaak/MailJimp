/*
 * Copyright 2011 Michael Laccetti
 *
 * This file is part of MailJimp.
 *
 * MailJimp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * MailJimp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with MailJimp.  If not, see <http://www.gnu.org/licenses/>.
 */
package mailjimp.dom.request.list;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

import mailjimp.dom.enums.EmailType;
import mailjimp.dom.request.MailJimpRequest;

public class ListSubscribeRequest extends MailJimpRequest {
  @JsonProperty("id")
  private String listId;
  
  @JsonProperty("email_address")
  private String emailAddress;
  
  @JsonProperty("merge_vars")
  private Map<String, Object> mergeVars;
  
  @JsonProperty("email_type")
  private EmailType emailType;
  
  @JsonProperty("double_optin")
  private Boolean doubleOptin;
  
  @JsonProperty("update_existing")
  private Boolean updateExisting;
  
  @JsonProperty("replace_interests")
  private Boolean replaceInterests;
  
  @JsonProperty("send_welcome")
  private boolean sendWelcome;
  
  public ListSubscribeRequest(String apikey, String listId, String emailAddress, Map<String, Object> mergeVars, EmailType emailType, Boolean doubleOptin, Boolean updateExisting, Boolean replaceInterests, boolean sendWelcome) {
    super(apikey);
    this.listId = listId;
    this.emailAddress = emailAddress;
    this.mergeVars = mergeVars;
    this.emailType = emailType;
    this.doubleOptin = doubleOptin;
    this.updateExisting = updateExisting;
    this.replaceInterests = replaceInterests;
    this.sendWelcome = sendWelcome;
  }

  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Map<String, Object> getMergeVars() {
    return mergeVars;
  }

  public void setMergeVars(Map<String, Object> mergeVars) {
    this.mergeVars = mergeVars;
  }

  public EmailType getEmailType() {
    return emailType;
  }

  public void setEmailType(EmailType emailType) {
    this.emailType = emailType;
  }

  public Boolean getDoubleOptin() {
    return doubleOptin;
  }

  public void setDoubleOptin(Boolean doubleOptin) {
    this.doubleOptin = doubleOptin;
  }

  public Boolean getUpdateExisting() {
    return updateExisting;
  }

  public void setUpdateExisting(Boolean updateExisting) {
    this.updateExisting = updateExisting;
  }

  public Boolean getReplaceInterests() {
    return replaceInterests;
  }

  public void setReplaceInterests(Boolean replaceInterests) {
    this.replaceInterests = replaceInterests;
  }

  public boolean isSendWelcome() {
    return sendWelcome;
  }

  public void setSendWelcome(boolean sendWelcome) {
    this.sendWelcome = sendWelcome;
  }
}