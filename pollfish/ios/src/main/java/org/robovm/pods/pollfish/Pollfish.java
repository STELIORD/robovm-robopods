/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.pollfish;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Pollfish/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PollfishPtr extends Ptr<Pollfish, PollfishPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Pollfish.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Pollfish(Handle h, long handle) { super(h, handle); }
    protected Pollfish(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAPIKey:andParams:")
    public static native void init(String apiKey, PollfishParams pollfishParams);
    @Method(selector = "show")
    public static native void show();
    @Method(selector = "hide")
    public static native void hide();
    @Method(selector = "isPollfishPresent")
    public static native boolean isPollfishPresent();
    @Method(selector = "isPollfishPanelOpen")
    public static native boolean isPollfishPanelOpen();
    @Method(selector = "destroy")
    public static native void destroy();
    @Method(selector = "updateLocationWithLatitude:andLongitude:andHorizontalAccuracy:")
    public static native void updateLocation(double lat, double lon, double acc);
    @Method(selector = "updateLocationWith:")
    public static native void updateLocation(CLLocation location);
    @Method(selector = "sendBeaconInfo:")
    public static native void sendBeaconInfo(CLBeacon beacon);
    /*</methods>*/
}
