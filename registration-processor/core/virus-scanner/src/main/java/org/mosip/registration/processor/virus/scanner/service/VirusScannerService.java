/**
 * 
 * 
 */
package org.mosip.registration.processor.virus.scanner.service;

import org.springframework.stereotype.Service;

/**
 * @author M1039303
 *
 * @param <U>
 *            Return type
 * 
 * @param <V>
 *            file path
 */
@Service
public interface VirusScannerService<U, V> {

	/**
	 * Scan file.
	 *
	 * @param fileName
	 *            the file name
	 * @return the u
	 */
	U scanFile(V fileName);

	/**
	 * Scan folder.
	 *
	 * @param folderPath
	 *            the folder path
	 * @return the u
	 */
	U scanFolder(V folderPath);
}
