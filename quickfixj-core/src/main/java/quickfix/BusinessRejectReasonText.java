/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix;

import java.util.HashMap;

import quickfix.field.BusinessRejectReason;

/**
 * Description strings for business reject reasons.
 *
 * @see BusinessRejectReason
 */
public class BusinessRejectReasonText extends BusinessRejectReason {
    private static final HashMap<Integer, String> rejectReasonText = new HashMap<Integer, String>();

    static {
        rejectReasonText.put(FIELD, "Field");
        rejectReasonText.put(OTHER, "Other");
        rejectReasonText.put(UNKOWN_ID, "Unknown ID");
        rejectReasonText.put(UNKNOWN_SECURITY, "Unknown Security");
        rejectReasonText.put(UNSUPPORTED_MESSAGE_TYPE, "Unsupported Message Type");
        rejectReasonText.put(APPLICATION_NOT_AVAILABLE, "Application Not Available");
        rejectReasonText.put(CONDITIONALLY_REQUIRED_FIELD_MISSING, "Conditionally Required Field Missing");
        rejectReasonText.put(NOT_AUTHORIZED, "Not authorized");
        rejectReasonText.put(DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME, "DeliverTo Firm Not Available At This Time");
    }

    /**
     * Get the description string for a specified business reject reason.
     *
     * @param rejectReason the reason
     * @return the description or null if there isn't a description for that reason
     */
    public static String getMessage(int rejectReason) {
        return rejectReasonText.get(rejectReason);
    }

}
