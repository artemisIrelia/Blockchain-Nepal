/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ellipticcurves;


import java.security.PrivateKey;
import java.security.PublicKey;
/**
 *
 * @author anish
 */
public class EncryptionWrapper {
      private byte[] encypted;
    private PublicKey publicKey;
    private PrivateKey privateKey;
    EllipticCurveEncryptionEngine engine;

    public void EncryptionWrapper() {
        engine = new EllipticCurveEncryptionEngine();
    }

    public byte[] getEncrypted (String message) {
        try {
            encypted = engine.encryptToByte(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encypted;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }
}
