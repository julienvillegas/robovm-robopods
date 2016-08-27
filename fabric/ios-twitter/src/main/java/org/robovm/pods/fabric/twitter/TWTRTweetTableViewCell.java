/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.twitter;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.accounts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRTweetTableViewCell/*</name>*/ 
    extends /*<extends>*/UITableViewCell/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRTweetTableViewCellPtr extends Ptr<TWTRTweetTableViewCell, TWTRTweetTableViewCellPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRTweetTableViewCell.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRTweetTableViewCell() {}
    protected TWTRTweetTableViewCell(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tweetView")
    public native TWTRTweetView getTweetView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configureWithTweet:")
    public native void configure(TWTRTweet tweet);
    @Method(selector = "heightForTweet:style:width:showingActions:")
    public static native @MachineSizedFloat double getHeightForTweet(TWTRTweet tweet, TWTRTweetViewStyle style, @MachineSizedFloat double width, boolean showActions);
    /*</methods>*/
}
