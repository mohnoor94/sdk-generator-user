mkdir -p tmp/templates
cp -r sdk-repo/generator/openapi/src/main/resources/templates/expediagroup-sdk/* tmp/templates

ls -la dummy/templates

if [ -n "dummy/templates" ] && [ -d dummy/templates ]; then
  cp -r dummy/templates/* tmp/templates
fi
