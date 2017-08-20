package com.github.lake54.groupsio.api.domain;

public enum UserStatus
{
    user_status_notconfirmed, user_status_confirmed, user_status_inactive, user_status_bouncing, user_status_bounced;
    
    public Boolean canSendBounceProbe()
    {
        switch (this)
        {
            case user_status_bounced:
            case user_status_bouncing:
                return true;
            default:
                return false;
        }
    }
}
