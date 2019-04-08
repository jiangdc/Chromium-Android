
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/speech/speech_recognizer.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface SpeechRecognitionSession extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SpeechRecognitionSession, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SpeechRecognitionSession, SpeechRecognitionSession.Proxy> MANAGER = SpeechRecognitionSession_Internal.MANAGER;


    void abort(
);



    void stopCapture(
);


}