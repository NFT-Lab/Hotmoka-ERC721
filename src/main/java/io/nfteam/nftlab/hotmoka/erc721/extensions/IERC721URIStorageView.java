package io.nfteam.nftlab.hotmoka.erc721.extensions;

import io.nfteam.nftlab.hotmoka.erc721.IERC721View;
import io.takamaka.code.lang.View;
import io.takamaka.code.math.UnsignedBigInteger;

public interface IERC721URIStorageView extends IERC721View {
  @View
  String tokenURI(UnsignedBigInteger tokenId);

  @Override
  @View
  IERC721URIStorageView snapshot();
}
